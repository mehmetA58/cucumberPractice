Feature: US999 amazon arama
@amazon
  Scenario: TC001 amazon java arama


    When  kullanici amazon sayfasina gider
    And   "java" için arama yapar
    Then sonucun java icerdigini test eder
    And sayfayi kapatir