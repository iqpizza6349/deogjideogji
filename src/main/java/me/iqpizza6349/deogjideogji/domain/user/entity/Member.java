package me.iqpizza6349.deogjideogji.domain.user.entity;

import jakarta.persistence.*;
import lombok.*;
import me.iqpizza6349.deogjideogji.domain.background.entity.Background;
import me.iqpizza6349.deogjideogji.domain.memo.entity.Memo;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor @NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(indexes = @Index(name = "unq_email", columnList = "email", unique = true))
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true, updatable = false)
    private String email;

    @OneToMany(mappedBy = "member", orphanRemoval = true)
    private List<Memo> memos = new ArrayList<>();

    @OneToOne(mappedBy = "member", orphanRemoval = true)
    private Background background;

}
