package shop.mtcoding.blog.board;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.mtcoding.blog.util.MyDateUtil;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
@Table(name = "board_tb")
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String username;
    private Timestamp createdAt;

    @Builder
    public Board(Integer id, String title, String content, String username, Timestamp createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.createdAt = createdAt;
    }

    public String getTime() {
        return MyDateUtil.timestampFormat(createdAt);
    }
}
