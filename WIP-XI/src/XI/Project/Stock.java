/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class Stock {

    public static void main(String[] args) {
        int item = 10;
        int limit = 15;
        int menu;

        Scanner sc = new Scanner(System.in);
        System.out.printf("สินค้าในสต๊อกมี %d จากเต็ม %d \n", item, limit);
        System.out.println("Menu :");
        System.out.println("1. Add item");
        System.out.println("2. Remove item ");
        System.out.println("3. Check itme ");
        System.out.println("Please enter what you do want : ");
        menu = sc.nextInt();

        if (menu == 1) {
            System.out.println("---------------");
            System.out.println("Menu 1 : Add item");
            if (item < limit) {
                System.out.print("Please enter number of item to add : ");
                int amount = sc.nextInt();
                if (item + amount > limit) {
                    System.out.println("ไอเท็มเกินลิมิต");
                } else {
                    item += amount;
                    System.out.printf("สินค้าในสต๊อกมี %d จากเต็ม %d \n", item, limit);
                }

            }

        }else if (menu == 2) {
            System.out.println("---------------");
            System.out.println("Menu 2 : Remove item");
            if (item > 0) {
                System.out.print("Please enter number of item to add : ");
                int amount = sc.nextInt();

                if (item - amount < 0) {
                    System.out.println("ไอเท็มมีไม่พอให้ลบ");

                } else {
                    item = item - amount;
                    System.out.printf("สินค้าในสต๊อกมี %d จากเต็ม %d \n", item, limit);
                }

            }else{
                System.out.println("ไม่มีไอเท็มในโกดัง");
            }
        }
        else if (menu == 3){
            System.out.printf("สินค้าในสต๊อกมี %d จากเต็ม %d \n", item, limit);
        }else {
            System.out.println("เมนูไม่ถูกต้อง");
        }
    }
}
