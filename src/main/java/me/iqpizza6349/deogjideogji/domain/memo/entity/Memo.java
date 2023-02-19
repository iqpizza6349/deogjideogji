package me.iqpizza6349.deogjideogji.domain.memo.entity;

import jakarta.persistence.*;
import lombok.*;
import me.iqpizza6349.deogjideogji.domain.user.entity.Member;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor @NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Memo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10000)
    private String content;

    @LastModifiedDate
    private LocalDate lastModifiedAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Member member;

    @OneToOne(mappedBy = "memo", orphanRemoval = true)
    private MemoDetail memoDetail;

    @OneToOne(mappedBy = "memo")
    private MemoDate memoDate;

}
