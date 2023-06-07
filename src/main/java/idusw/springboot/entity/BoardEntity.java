package idusw.springboot.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // 엔티티 클래스임으로 나타내는 애노테이션
@Table(name = "b201818064_b")

@ToString(exclude = "writer")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
// @Data // ==  @ToString, @EqualsAndHashCode, @Getter @Setter @RequiredArgsConstructor
// JPA Auditing 을 활용하여서 생성한사람, 생성일자, 수정한사람, 수정일자 등을 선택하여서 감사
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "b201818064_b_seq_gen")
    // Oracle : GenerationType.SEQUENCE, Mysql/MariaDB : GenerationType.IDENTITY, auto_increment
    @SequenceGenerator(sequenceName = "b201818064_b_seq", name = "b201818064_b_seq_gen", initialValue = 1, allocationSize = 1)
    private Long bno; // 유일성 있음

    @Column(length = 20, nullable = false)
    private String title;

    @Column(length = 1000, nullable = false)
    private String content;

    @ManyToOne
    // @JoinColumn(name = "seq")
    private MemberEntity writer; // BoardEntity : MemberEntity = N : 1

}