package shop.mtcoding.blog.board;

import lombok.Data;
import shop.mtcoding.blog.user.User;

public class BoardRequest {

    @Data
    public static class UpdateDTO{
        private String title;
        private String content;
    }

    @Data
    public static class SaveDTO{
        private String title;
        private String content;

        // DTO를 client로부터 받아서 PersistContext에 전달하기 위해 사용
        public Board toEntity(User user){
            return Board.builder()
                    .title(title)
                    .content(content)
                    .user(user)
                    .build();
        }
    }
}