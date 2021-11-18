@hepsi
Feature: US999 amazon arama

  Scenario: TC001 amazon java arama


    When  kullanici amazon sayfasina gider
    And   "java" için arama yapar
    Then sonucun java icerdigini test eder
    And sayfayi kapatir

#Youtube ana sayfasina gidelim . https://www.youtube.com/
#Amazon soyfasina gidelim. https://www.amazon.com/
#Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)
#Tekrar YouTube’sayfasina donelim
#Sayfa URL’inin www.youtube.com oldugunu dogrulayin
#Yeniden Amazon sayfasina gidelim
@tekrarAmazon
Scenario: TC002 Youtube'a git Amazon'a dön

  Given "youtubeURL" ana sayfasina gidelim
  Then kullanici amazon sayfasina gider
  And Sayfa basliginin (title) "Amazon" icerdigi dogrulayin.
  Then "youtubeURL" ana sayfasina gidelim
  And Sayfa URL’inin "https://www.youtube.com/" oldugunu dogrulayin
  Then kullanici amazon sayfasina gider
  And sayfayi kapatir




  #Amazon soyfasina gidelim. https://www.amazon.com/
  #Search(ara) “mango”,"nane","java","cucumber"için arama yap
  #görüntülenen ilgili sonuçların sayısını yazdırın

@amazonOutline
  Scenario Outline:TC006 Amazon Arama

   Given kullanici amazon sayfasina gider
    When "<arananKelime>" için arama yapar
    Then Amazonda görüntülenen ilgili sonuçların sayısını yazdırın
    And Amazonda görüntülenen ilgili sonuclar "<arananKelime>" iceriyormu
    And sayfayi kapatir
  Examples:
    | arananKelime |
  |mango         |
  |nane          |
  |java          |
  |cucumber      |


































