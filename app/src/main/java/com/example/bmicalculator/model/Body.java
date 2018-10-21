package com.example.bmicalculator.model;

public class Body {

    private int height;
    private int weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public float calculateBmi() {
        // สูตรคำนวณ bmi = kg / m^2
        float height = this.height / 100f;

        float bmi = this.weight / (height * height);
        return bmi;
    }

    public String getResultText() {
        float bmi = calculateBmi();
        String resultText = null;
        if (bmi < 18.5) {
            resultText = "ผอมเกินไป";
        } else if (bmi < 25) {
            resultText = "น้ำหนักปกติ ไม่อ้วนไม่ผอม";
        } else if (bmi < 30) {
            resultText = "อ้วน";
        } else {
            resultText = "อ้วนมาก";
        }
        return resultText;
    }
}
