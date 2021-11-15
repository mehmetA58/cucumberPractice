
Feature: US999 amazon arama
  @amazon
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

Scenario: TC002 Youtube'a git Amazon'a dön

  Given "youtubeURL" ana sayfasina gidelim
  Then kullanici amazon sayfasina gider
  And Sayfa basliginin (title) "Amazon" icerdigi dogrulayin.
  Then "youtubeURL" ana sayfasina gidelim
  And Sayfa URL’inin "https://www.youtube.com/" oldugunu dogrulayin
  Then kullanici amazon sayfasina gider
  And sayfayi kapatir

  #Amazon soyfasina gidelim. https://www.amazon.com/
  #Search(ara) “city bike”
  #görüntülenen ilgili sonuçların sayısını yazdırın
  #“Shopping” e tıklayın.
  #Sonra karşınıza çıkan ilk sonucun resmine tıklayın
  #Sonucun “city bike” içerdiğini test edin.
  #gelen sonuclardan 4.ve 7.nin isimlerini yazdirin

  Scenario:TC006 Amazon Arama sonuclarını yazdirma.