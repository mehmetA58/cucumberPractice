
Feature: 1005 https://www.saucedemo.com Adresine gidin


  #“https://www.saucedemo.com” Adresine gidin
#Username kutusuna “standard_user” yazdirin
#Password kutusuna “secret_sauce” yazdirin
#Login tusuna basin
#Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
#Add to Cart butonuna basin
#Alisveris sepetine tiklayin
# Sectiginiz urunun basarili olarak sepete eklendigini control edin
#Sayfayi kapatin
  Scenario: TC 008 Sepete Ürün Ekleme

    Given "sauceDemoURL" ana sayfasina gidelim
    Then Username kutusuna “standard_user” yazdirin
    And   Password kutusuna “secret_sauce” yazdirin
    When Login tusuna basin
    Then Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
    And Add to Cart butonuna basin
    And Alisveris sepetine tiklayin
    Then Sectiginiz urunun basarili olarak sepete eklendigini control edin
    And sayfayi kapatir

