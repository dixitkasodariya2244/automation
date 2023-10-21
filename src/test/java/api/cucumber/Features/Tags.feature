@mustRun
  Feature:  feature1
    @notimportant
    Scenario: scenario 1
      Given given1
      When when
      And and
      Then then

    @important
    Scenario: scenario 2
      Given given2
      When when2
      And and2
      Then then2

    @important @notimportant
    Scenario: scenario 3
      Given given3
      When when3
      And and3
      Then then3

    @veryimportant
    Scenario: scenario 4
      Given given4
      When when4
      And and4
      Then then4

    @veryimportant @important
    Scenario: scenario 5
      Given given5
      When when5
      And and5
      Then then5

    @veryimportant @important @notimportant
    Scenario: scenario 5
      Given given5
      When when5
      And and5
      Then then5