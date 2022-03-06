@evreka
Feature: evreka
  Scenario:
  #1. Go to 'https://www.amazon.com.tr/'
  #2. Search iPhone13 512
  #3. Check that the results are listed
  #4. Click iPhone13 at the top of the list
  #5. Log the following values for each size
  #.Size information .Price .Color .Stock status

    Given "amazonUrlTR" ana sayfasina gidelim
    Then "iPhone13 512" için arama yapar
    When Amazonda görüntülenen ilgili sonuclar "iPhone13 512" iceriyormu
    And Click iPhone13 at the top of the list
    And Log the following values for each size
    And sayfayi kapatir