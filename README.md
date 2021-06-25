 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/01.png)
 
▲早餐訂購系統 – 首頁（初始頁面）

提供櫃檯人員點餐，產品未加入購物車時，在右下方的購物車，顯示”無商品”，並且不顯示結帳按鈕（如上圖紅框處）。

![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/02.png)

▲早餐訂購系統 – 首頁（已新增產品到購物車）

提供櫃檯人員點餐，產品加入購物車後，在右下方的購物車，會顯示已加入的產品名稱與數量、自動計算總金額，並且顯示結帳按鈕（如上圖紅框處）。

![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/03.png)

▲早餐訂購系統 – 數量驗證

在選購產品數量時，設有數量判斷驗證，input採用number類別，並設定最小值為1，若輸入小於1的數值則會出現上圖的錯誤訊息。

![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/04.png)

▲早餐訂購系統 – 篩選條件

在篩選條件時，設有驗證機制，若無輸入任何資料，則會出現如上圖的紅色訊息。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/05.png)
 
▲早餐訂購系統 – 篩選結果

若找不到相關產品，會顯示”找不到商品”的訊息（如上圖所示）；若有找到相關產品，則會顯示找到的相關產品。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/06.png)
 
▲早餐訂購系統 – 購物車

在此頁面提供，數量修改、已加入購物車的產品刪除、繼續購買、結帳的功能，並設有右下角的進度條（此時進度條為50%）。若在早餐訂購系統 – 首頁，重複添加相同產品，則在此頁面的數量會自動與已在購物車內的數量相加。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/07.png)
 
▲早餐訂購系統 – 確認訂單

在此頁面顯示購物清單，若發現訂購商品有誤，可以透過”清單修改”按鈕，返回購物車。在訂購資訊中設有用餐方式的下拉選單，點選不同用餐方式，則會顯示不同的表格，最後一樣設有進度條（此時進度條為75%）。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/08.png)
 
▲早餐訂購系統 – 訂購資訊表格（內用）

點選內用後，顯示桌號輸入框與確定購買按鈕，此時進度條變更為100%，並設有驗證機制，若輸入不正確，會出現紅色的錯誤訊息（如上圖）。另外，input採用number類別，防止操作人員輸入數字以為的文字。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/09.png)
 
▲早餐訂購系統 – 訂購資訊表格（外帶）

點選外帶後，顯示確定購買按鈕，此時進度條變更為100%。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/10.png)
 
▲早餐訂購系統 – 訂購資訊表格（外送）

點選外送後，顯示訂購者姓名、電話、外送地址的輸入框與確定購買按鈕，此時進度條變更為100%，並設有驗證機制，若輸入不正確，會出現紅色的錯誤訊息（如上圖）。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/11.png)
 
▲產品管理系統 – 首頁

在頁面可以進行產品的新增、修改、刪除，並設有篩選條件。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/12.png)
 
▲產品管理系統 – 篩選條件

在篩選條件中，設有驗證機制，若輸入不正確，會出現紅色的錯誤訊息。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/13.png)
 
▲產品管理系統 – 篩選結果

若找不到相關產品，會顯示”找不到商品”的訊息（如上圖所示）；若有找到相關產品，則會顯示找到的相關產品。


 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/14.png)
 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/15.png)
 
▲產品管理系統 – 新增產品

在此頁面輸入產品相關資料後，點選送出，即可新增產品。在編號中，會自動產生相連的id，故此欄預設為鎖定，在圖片中，採用點選方式上傳，而且設有圖片預覽的功能，送出資料時，會進行資料驗證，若不正確，則會顯示紅色的錯誤訊息（錯誤訊息如右圖）。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/16.png)
  ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/17.png)
  
▲產品管理系統 – 更新產品

在此頁面修改產品資訊後，點選送出，即可更新產品。在編號中，因為不可以更改，故此欄預設為鎖定，在圖片中，設有輸入檔名與點選上傳兩種方式，而且具有圖片預覽（如右圖）的功能，送出資料時，會進行資料驗證，若不正確，則會顯示紅色的錯誤訊息（錯誤訊息如右圖）。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/18.png)
 
▲產品管理系統 – 圖片點選上傳

在新增與修改產品頁面的圖片點選上傳中，開啟時會預設為僅顯示圖檔（如上圖紅框處），若上傳非許可的圖檔格式則會跳出提示框（如下圖）。

 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/19.png)
 
 
 
  ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/20.png)
  
▲產品管理系統 – 刪除

點擊刪除時，會跳出提示框（如上圖），若確定刪除，點擊確定，即成功刪除，反之，點即取消，則不刪除。
 
  ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/21.png)
  
▲訂單管理系統 – 首頁

點擊已出餐（黃色按鈕），可以將餐點狀態更改為已出餐，上方設有訂單編號、未出餐、已出餐查詢的功能，並有驗證機制，若輸入不正確，會出現紅色的錯誤訊息（如上圖紅框處）。
 
 ![image](https://github.com/bingxue1114/Springboot-POS/blob/master/IMG/22.png)
 
▲訂單查詢系統

顧客可以透過此頁面，利用訂單編號（內用/外帶）、訂購者姓名與電話（外送）查詢自己訂單中各項產品是否出餐，並在查詢功能中，設有驗證機制，若輸入不正確，會出現紅色的錯誤訊息（如上圖紅框處）。

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

SpringBoot附件檔案檔名與系統和本機端網址搭配：

> POS訂購系統

　　檔名：SpringbootProject-Lab30-ShoppingCart
  
　　本機端網址：http://localhost:8080/
  
>	產品管理系統：

　　檔名：SpringbootProject-Lab25-DrinkProductCRUD
  
　　本機端網址：http://localhost:8081/
  
>	訂單管理系統：

　　檔名：SpringbootProject-Lab32-OrderCRUD
  
　　本機端網址：http://localhost:8082/
  
>	訂單查詢系統：

　　檔名：SpringbootProject-Lab31-CustomerSearch
  
　　本機端網址：http://localhost:8083/
  
> 資料庫：my2_pos.sql
