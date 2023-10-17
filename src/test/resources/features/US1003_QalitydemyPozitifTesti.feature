Feature:  US1003 kullanici gecerli bilgilerle sayfaya giris yapar

  Scenario: TC qualitydemy pozitif login testi
    Given  kullanici "qdUrl" anasayfaya gider
    Then  ilk login linkine tiklar
    And username kutusuna "qdGecerliEmail" yazar
    And password kutusuna " qdGecerliPassword" yazar
    And login butonuna basar
    And basarili giris yapildigini test eder
    And sayfayi kapatir