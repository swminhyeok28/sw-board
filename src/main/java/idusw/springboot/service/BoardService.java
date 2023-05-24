package idusw.springboot.service;

import idusw.springboot.domain.Board;
import idusw.springboot.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    int registerBoard(Board board);
    Board findBoardById(Board board); // 게시물의 ID (유일한 식별자) - 즉, 0ㅔbno로 조회
    List<Board> findBoardAll(); // 게시물 목록 출력 (페이지 처리나 정렬, 필터)
    int updateBoard(Board board); // 게시물 정보
    int deleteBoard(Board board); // 게시물의 ID 값만
}
