// *+Задано уравнение вида q + w = e. При q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
		// Ввод используя Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите коэффициент q: ");
		int q = sc.nextInt();
		System.out.print("Введите коэффициент w: ");
		int w = sc.nextInt();
		System.out.print("Введите коэффициент e: ");
		int e = sc.nextInt();
		boolean fSolution = false;
		// Поиск решения
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
              // Печать результата
                if (solve(q, i, w, j, e)){
                    System.out.printf("Результат для q=%d, w=%d, e=%d при %d,%d => %d%d + %d%d = %d\n", q,w,e,q,i,j,i,j,w,e);
                    fSolution = true;
                }
            }
        }
        if (!fSolution) System.out.printf("Для q=%d, w=%d, e=%d результата нет\n",  q,w,e);
    }
            
    // Проверка решения
    public static boolean solve(int q, int i, int w, int j, int e) {
        boolean res = q*10+i + w+(j*10) == e;
        return res;
    }
}
