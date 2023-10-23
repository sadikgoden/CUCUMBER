Feature:  US1008 kullanici herokup sayfasina beklemeleri yapar

  Scenario: TC12 kullanici bekleme islemlerini yapar
    Given kullanici "herokuappUrl" anasayfaya gider
    And 2 saniye bekle
    When Add Element butona basar
    And Delete butonu gorunur oluncaya kadar bekler
    Then Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder
    And sayfayi kapatir