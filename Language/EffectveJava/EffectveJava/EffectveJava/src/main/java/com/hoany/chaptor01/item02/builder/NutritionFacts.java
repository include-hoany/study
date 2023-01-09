package com.hoany.chaptor01.item02.builder;

// 코드 2-3 빌더 패턴 - 점층적 생성자 패턴과 자바빈즈 패턴의 장점만 취했다.
public class NutritionFacts {

    // 필드는 (기본값이 있다면) 기본값으로 초기화된다.

    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int servingSize;
        private int servings;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder servingSize(int val) {
            servingSize = val;
            return this;
        }

        public Builder servings(int val) {
            servings = val;
            return this;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = NutritionFacts
                .builder()
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }

}
