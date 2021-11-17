@hepsi
Feature: 1003 TestAdress
    #http://a.testaddressbook.com adresine gidiniz.
  #Sign in butonuna basin
  #Kullanıcı adını ve şifreyi girin
  # oturum aç (sign in)buttonunu tıklayın
  #Expected user id dogrulayin(verify).
  #Sayfada kac tane link oldugunu bulun.
  #linklerin yazılarını yazdiralim
  #TestData;
   #Username : testtechproed@gmail.com
  #Password : Test1234!
  #user id nin testtechproed@gmail.com
  @testAdress
  Scenario: TC005 TestAddressBook
    Given "testAdressUrl" ana sayfasina gidelim
    Then  TestAdreesAnasayfa Sign in butonuna tiklayin
    And  TestAdressKullanıcı adını ve şifreyi girin
    Then Expecteduserid'yi dogrulayon
    And Sayfada kac tane link oldugunu bulun.
    Then linklerin yazılarını yazdiralim
    And sayfayi kapatir
