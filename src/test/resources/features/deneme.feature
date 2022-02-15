Feature:US 1000 deneme

  Scenario Outline:
    Given kullanici amazon sayfasina gider
    When "<arananKelime>" için arama yapar
    Then Amazonda görüntülenen ilgili sonuclar "<arananKelime>" iceriyormu
    And Amazonda görüntülenen ilgili sonuçların sayısını yazdırın
    And sayfayi kapatir
    Examples:
      | arananKelime |
      | java         |
      | mango        |
      | miniCooper   |