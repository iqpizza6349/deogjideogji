package me.iqpizza6349.deogjideogji.domain.memo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@AllArgsConstructor @NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemoDate {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @MapsId
    @OneToOne(optional = false)
    @JoinColumn(name = "memo_id")
    private Memo memo;

    @Column(nullable = false)
    private LocalDate startDate;

    private LocalDate endDate;

}
