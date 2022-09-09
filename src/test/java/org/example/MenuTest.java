package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuTest {

    @DisplayName("메뉴판에서 메뉴 이름에 해당하는 메뉴를 반환한다")
    @Test
    void chooseTest() {
        Menu menu = new Menu(List.of(new Menuitem("돈까스", 5000), new Menuitem("냉면", 7000)));

        Menuitem menuitem = menu.choose("돈까스");
        assertThat(menuitem).isEqualTo(new Menuitem("돈까스", 5000));
    }
}
