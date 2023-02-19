package me.iqpizza6349.deogjideogji.domain.memo.constaint;

import lombok.Getter;

@Getter
public enum Font {
    GOTHIC("맑은 고딕")
    ;

    private final String fontName;

    Font(String fontName) {
        this.fontName = fontName;
    }
}
