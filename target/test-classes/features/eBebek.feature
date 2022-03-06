
Feature: eBebek
  
  Scenario: eBebek Searching
    Given "EbebekURL" sayfasina gidelim
    When "ZIBIN" icin arama yapar
    Then arama sonucunun "ZIBIN" icerdigini dogrular
    And ilk sonuc sayfasinda listelenen urunleri yazdirir
    And sayfayi kapatir