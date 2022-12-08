package com.example.javadesignpatterns.example.p12_decorator.q1;

// UpDownBorder 클래스를 구현해 보세요.
public class UpDownBorder extends Border {

    public UpDownBorder(Display display, char ch) {        // 생성자에서는 장식할 문자를 받는다
        super(display);
    }

    @Override
    public int getColumns() {                            // 문자수는 '내용물'의 문자수와 같다
        return 0;
    }

    @Override
    public int getRows() {                                // 행수는 '내용물'의 행수에 상하 경계분을 더한다
        return 0;
    }

    @Override
    public String getRowText(int row) {
        return null;
    }

    private String makeLine(char ch, int count) {

        return null;
    }
}
