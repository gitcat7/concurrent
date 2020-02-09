package com.example.concurrency.example.publish;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Escape {

    private int thisCanBeEscape = 0;
    private int x = 2;

    public Escape() {
        new InnerClass();
    }

    public Escape(int x) {
        Escape.this.x = x;
    }

    private class InnerClass{
        private int x = 1;
        public InnerClass() {
            log.info("{}", InnerClass.this.x);
            log.info("{}", Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
