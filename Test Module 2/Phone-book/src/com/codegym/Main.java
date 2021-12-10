package com.codegym;

import com.codegym.File.ReadFile;
import com.codegym.File.WriteFile;
import com.codegym.Management.PhoneBookManagement;
import com.codegym.Services.Services;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PhoneBookManagement phoneBookManagement= new PhoneBookManagement();
        Scanner scanner= new Scanner(System.in);
        try {
            do {
                System.out.println("--- Chương trình quản lý danh bạ---");
                System.out.println("Chọn chức năng theo số (để tiếp tục: ");
                System.out.println("1. Xem danh sách");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Tìm kiếm");
                System.out.println("6. Đọc từ file");
                System.out.println("7. Ghi vào file");
                System.out.println("8. Thoát");

                System.out.println("Chọn chức năng");
                int number = Integer.parseInt(scanner.nextLine());
                if (number> 0 && number< 8){
                    switch (number){
                        case 1:
                            phoneBookManagement.showAll();
                            break;
                        case 2:
                            phoneBookManagement.addNew();
                            break;
                        case 3:
                            phoneBookManagement.update();
                            break;
                        case 4:
                            phoneBookManagement.delete();
                            break;
                        case 5:
                            phoneBookManagement.search();
                            break;
                        case 6:
                            phoneBookManagement.readFile();
                            break;
                        case 7:
                            phoneBookManagement.writeFile();
                            break;
                    }
                }
                else if (number == 8)
                    break;
                else
                    System.out.println("Vui lòng nhập từ 1 đến 8");
            } while (true);
        }
        catch (Exception e){
            System.err.println("Lỗi. Vui lòng nhập số");
        }
    }
}
