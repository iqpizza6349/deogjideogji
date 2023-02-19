package me.iqpizza6349.deogjideogji.domain.background.entity;

import jakarta.persistence.*;
import lombok.*;
import me.iqpizza6349.deogjideogji.domain.user.entity.Member;

@Entity
@Getter
@Builder
@AllArgsConstructor @NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Background {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 128)
    private String directory;

    @Column(nullable = false, length = 64)
    private String filename;

    @OneToOne(optional = false)
    private Member member;

}
