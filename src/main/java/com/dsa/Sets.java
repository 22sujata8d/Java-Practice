package com.dsa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("purple"));
        balls.remove(new Ball("red"));

        System.out.println(balls.size());
        balls.forEach(System.out::println);

        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        numbers.forEach(System.out::println);
    }

    static class Ball{
        String color;
        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }
    }

//     record  Ball(String color){};
}
