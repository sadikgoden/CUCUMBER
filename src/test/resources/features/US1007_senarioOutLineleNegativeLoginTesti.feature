Feature:  US1007 liste olarak verilen kullanici adi ve sifrelerle giris yapilamadigini test eder
  Scenario Outline: TC11 qualitydemy sayfasina yanlis bilgilerle giris yapilamaz
    Given kullanici "qdUrl" anasayfaya gider
    Then coocies kabul eder
    Then ilk login linkine tiklar
    And username kutusuna examples'den "<gecersizEmail>" yazar
    And password kutusuna examples'den "<gecersizPassword>" yazar
    And login butonuna basar
    Then basarili giris yapilamadigini test eder
    And sayfayi kapatir
    Examples:
      | gecersizEmail | gecersizPassword |
      | sadik@gmail.com   | asadasd    |
      | celil@gmail.com  |  123456    |
      | aysesadik@gmail.com| asadasd  |
      | aysecelil@gmail.com|  123456  |


