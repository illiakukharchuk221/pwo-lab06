/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LucasGenerator {

    public static void main(String[] args) {
        int n = 100; // Количество чисел Люка для генерации
        long[] lucas = new long[n];
        lucas[0] = 2; // Первое число Люка
        lucas[1] = 1; // Второе число Люка

        // Генерация 100 чисел Люка
        for (int i = 2; i < n; i++) {
            lucas[i] = lucas[i - 1] + lucas[i - 2];
        }

        // Запись чисел в файл
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("lucas_numbers.txt"))) {
            for (long lucasNumber : lucas) {
                bw.write(lucasNumber + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
