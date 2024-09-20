# Step 1
Create Project 
- akses web https://start.spring.io/
</br>
Defedency :
</br>
1.Spring Data JPA  
</br>
2.MYSQL Driver
</br>
3.Spring Web
</br>
4.Project Lombok 

# Step 2
Create Table Entity class Phonebook (Model)
Database and Jpa Properties (connection database)
Create File Repository (JPA repository)
Create add file Service (logic functional service)
Create add file Controller (Endpoint to API )

Running vscode :
- mvn spring-boot:run

## Testing Endpoint API with POSTMAN

### API GETALL PHONEBOOKS
![image](https://github.com/user-attachments/assets/1520f5ed-b865-4448-8254-bbdd2594730b)
### API POST PHONEBOOKS
![image](https://github.com/user-attachments/assets/19aab8a7-aaba-4c15-9597-9f9a64dcb3f5)
### API GET BYID PHONEBOOKS
![image](https://github.com/user-attachments/assets/a590a1a7-e3b4-43b1-96da-d6faf1274647)
### API PUT PHONEBOOKS
![image](https://github.com/user-attachments/assets/7107e1d5-2c27-4a5d-98e2-c39ebc64b50e)
### API DELETE PHONEBOOKS
![image](https://github.com/user-attachments/assets/fded87f5-e775-484a-9bf8-5926ca6a9c22)


### DATABASE TABLE MYSQL
![image](https://github.com/user-attachments/assets/1e5be536-ab5f-4b13-b208-a742893f0bae)

## Scripting 
![image](https://github.com/user-attachments/assets/620dc41b-5283-4b8f-9567-844d53e63124)
</br>
Penjelasan kode diatas :
</br>
Terlihat bahwa dalam class entity Product kali ini kita mengunakan plugin Lombok.
- @Data : untuk menggenerate getter dan setter
- @NoArgsConstructor : menyediakan konstruktor default
- @AllArgsConstructor : menyediakan kontruktor dengan parameter sebanyak jumlah
atribut nya yaitu nama, harga beli dan harga jual.
- @ToString : untuk menggenerate method toString



