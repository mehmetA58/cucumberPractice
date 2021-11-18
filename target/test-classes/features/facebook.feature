@hepsi
Feature: 1002 Facebook Handle

  Scenario: TC003 Facebook

    #Facebook ana sayfasina gidelim . https://www.facebook.com/
    #email textbox'a e-mail yazdiralim
    #şifre textbox'a şifre yazdiralim
    #giris yap butanuna tıklayalım
    #hata mesajını doğrulayalım.

    Given "facebookURL" ana sayfasina gidelim
    Then   facebookEmailTextboxa email yazdiralim
    Then facebookPasswordTextboxa sifre yazdiralim
    And facebook login butonunu tıklayalım
    Then facebookBasarisizGiris dogrulama
    And sayfayi kapatir
