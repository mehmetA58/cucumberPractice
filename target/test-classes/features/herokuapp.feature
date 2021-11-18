@hepsi
Feature: 1004 Herokuapp visit and click

#https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
#Add Element butonuna basin
#Delete butonu’nun gorunur oldugunu test edin
#Delete tusuna basin
#sayfayi kapatin
@herokuapp
  Scenario: TC005 herokuapp visit.
  Given "herokuAppUrl" ana sayfasina gidelim
  Then Add Element butonuna tiklayin
  And Delete butonu’nun gorunur oldugunu test edin
  Then Delete tusuna tiklayalim
  And sayfayi kapatir