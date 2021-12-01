Feature: US1006 Demo guru Drag and Drop
  
  Scenario: TC009 Drag and Drop
    
#Go to http://demo.guru99.com/test/drag_drop.html url
#Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
#Drag and drop the BANK button to the Account section in DEBIT SIDE
#Drag and drop the SALES button to the Account section in CREDIT SIDE
#Drag and drop the 5000 button to the Amount section in DEBIT SIDE
#PerfectButton visibilty do test
  
    Given "demoGuruURL" ana sayfasina gidelim
    Then Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
    And Drag and drop the BANK button to the Account section in DEBIT SIDE
    Then Drag and drop the SALES button to the Account section in CREDIT SIDE
    And Drag and drop the 5000 button to the Amount section in DEBIT SIDE
    When PerfectButton visibilty do test
    And sayfayi kapatir

