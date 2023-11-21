# Java Composition

### Proje Kurulumu

Projeyi önce forklayın daha sonra klonlayın ve Intellij kullanarak projeyi açın. 
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

Sınıf yazmaya doyduğunuz bir proje olması dileklerimle....

### Home.BaseModels.Lamp
* Home.BaseModels.Lamp isimli bir sınıf yazınız.
* Home.BaseModels.Lamp sınıfı için 3 tane ```instance variable``` tanımlamalıyız. ```style``` tipi LampType isminde bir enum olmalı. ```battery``` tipi boolean olmalı. ```globRating``` tipi int olmalı. 
* Home.BaseModels.Lamp sınıfının tüm değişkenleri `private` olmalı. Home.BaseModels.Lamp sınıfı için 3 değişkeninde eklenebileceği tek bir ```constructor``` olmalı.
* Home.BaseModels.Lamp sınıfı için toplamda 4 metod yazmamız gerekiyor. ```turnOn``` herhangi bir değer dönmeyecek. Sadece 'Home.BaseModels.Lamp is being turned on.' mesajının ekrana basacak.
* ```getStyle()``` style değişkenin değerini dönmeli. ```isBattery()``` battery değişkeninin değerini dönmeli. ```getGlobalRating()``` globalRating değişkeninin değerini dönmeli.

### Bed
* Bed isminde bir sınıf yazınız.
* Bed sınıfı için 5 tane ```instance variable``` tanımlamalıyız. style tipi String olmalı. ```pillows, height, sheets, quilt``` tipleri int olmalı. Hepsi private olmalı.
* Bed sınıfı için bir constructor yazmalıyız.
* Bed sınıfı için 5 metod yazacağız. ```make``` herhangi bir return değeri olmayacak. Sadece 'The bed is being made.' mesajını ekrana basacak.
* ```getPillows()``` pillows sayısını return etmeli. ```getHeight()``` height değerini return etmeli. ```getSheets()``` sheets sayısını return etmeli. ```getQuilts()``` quilts sayısını return etmeli.

### Wardrobe 
* Wardrobe isminde bir sınıf yazınız. 
* Wardrobe sınıfı için 3 adet ```instance variable``` tanımlayınız. ```int width, int height, double weight``` Hepsi private olmalı.
* Wardrobe sınıfı için constructor & getter metodlarını yazınız.
* Wardrobe sınıfı içerisinde ```add``` isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek. Sadece 'Wardrobe added into Bedroom.' mesajını ekrana basacak.

### Carpet
* Carpet isminde bir sınıf yazınız.
* Carpet sınıfı için 3 adet ```instance variable``` tanımlayınız. ```int width, int height, PaintColor color``` Hepsi private olmalı.
* Carpet sınıfı için constructor & getter metodlarını yazınız.
* Carpet sınıfı içerisinde ```lying``` isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek. Sadece 'Carpet is lying on Bedroom floor.' mesajını ekrana basacak.

### Ceiling
* Ceiling isminde bir sınıf yazınız. Ceiling sınıfının 2 tane ```instance variable``` olmalı. ```height``` ve ```paintedColor```. height int tipinde olmalı paintedColor PaintColor isminde bir enum olmalı ve ikisi de private olmalı.
* Ceiling sınıfının bir ```constructor``` metodu olmalı. 2 değişkenine de değer atamalı.
* Ceiling sınıfının ```getHeight()``` adında bir metodu olmalı. height değerini dönmeli. ```getPaintedColor``` adında bir metodu olmalı ve paintedColor değerini dönmeli.
* Ceiling sınıfının ```create``` isimli bir metodu olmalı. Ceiling objesinin height ve paintingColor değerlerini ekrana basmalı.

### Wall
* Wall isminde bir sınıf yazınız. İçerisinde bir tane değişkeni olmalı ```direction``` String değerinde olmalı ve private olarak tanımlanmalı.
* Wall sınıfının bir ```constructor``` metodu olmalı ve tek değişkenine değer atamalı.
* Wall sınıfının iki metodu olmalı. ```getDirection``` direction değişkeninin değerini dönmeli. ```create``` metodu Wall objesinin hangi directiona göre oluşturulduğunu ekrana basmalı.

### Bedroom 
* Bedroom isimli bir sınıf oluşturunuz.
* Bu sınıfın 10 tane ```instance variable``` değeri olmalı. ```name``` String tipinde. ```wall1 wall2 wall3 wall4``` Wall tipinde. ```ceiling``` Ceiling tipinde.
  ```bed``` Bed tipinde. ```lamp``` Home.BaseModels.Lamp tipinde. ```wardrobe``` Wardrobe tipinde. ```carpet``` Carpet tipinde.
* Sınıfımızın ```constructor``` metodu tek olmalı ve 10 değişkeni de almalı. 
* getter metodlarını eklemelisiniz.

### Enums
* LampType ve PaintColor isminde iki tane enum tanımlamalısınız.
* Detaylarını istediğiniz gibi oluşturabilirsiniz.

### Uygulamayı Test Etmek

 Bir adet Bedroom objesi oluşturun. İçerdiği sınıfların tüm değerlerine rahatlıkla erişebilmeli, tüm metodlarını çağırabilmelisin. 

### For Challengers
 * Room isminde bir sınıf tanımlasaydık. Bedroom ile ilişkisi nasıl olurdu ?
 * Bedroom'un hangi ```instance variable``` değerleri Room içerisine alınıp buradan yönetilebilirdi ?
 * Yapılan dizaynı bu bağlamda değiştiriniz.



