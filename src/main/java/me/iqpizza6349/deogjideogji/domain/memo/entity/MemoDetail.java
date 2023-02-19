package me.iqpizza6349.deogjideogji.domain.memo.entity;

import jakarta.persistence.*;
import lombok.*;
import me.iqpizza6349.deogjideogji.domain.memo.constaint.Font;
import org.hibernate.annotations.SQLDelete;

@Entity
@Getter
@Builder
@SQLDelete(sql = "update memo_detail set deleted = true where id = ?")
@AllArgsConstructor @NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemoDetail {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @MapsId
    @OneToOne(optional = false)
    @JoinColumn(name = "memo_id")
    private Memo memo;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Font font;

    @Builder.Default
    @Column(nullable = false)
    private boolean deleted = false;

    public void changeFont(Font font) {
        this.font = font;
    }
}
