package semana_cuatro_ejercicios;

import java.io.*;

public class Suma {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Sumando 1 : ");
            int s1 = Integer.parseInt(br.readLine());
            System.out.print("Sumando 2 : ");
            int s2 = Integer.parseInt(br.readLine());
            System.out.println("La suma es " + s1 + "+" + s2 + "=" + (s1 + s2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}