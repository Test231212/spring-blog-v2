package shop.mtcoding.blog.board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class BoardQueryRepository {
    private final EntityManager em;

//    public void findAllWithReplyCount(){
//        Query query = em.createQuery();
//    }
}
