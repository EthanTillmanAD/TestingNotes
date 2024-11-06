public class TestingNotes {
    /*

  Software maintenance challenges

  code entropy - can become brittle over time
  isolated ownership - code owned silos
  infrequent validation - can be high risk of code changes and cause issues

  legacy code can be seen as
  inherited code from someone else
  an older versions of the software
  code without test

   TDD - test driven development
   Test - something that verifies your code works as it's expected to

   must meet 3 things
   satisfies to the requirements
   respond correctly to all inputs
   acceptable performance

    red-green-refactor

    red - write a test that fails
    green - make it pass
    refactor - cleanup the code fully

    tdd has been around for years and helps maintain the structure/framework of the software

    practicing tdd is beneficial, it helps understand the requirements verification
    helps find regressions inside the software
    also helps lower the maintenance cost for the software

    designing failing tests helps understand how they must work and having a design first mentality
    helps from over developing code

    increase your developer momentum

    helps focus on the needs of the customer

    Different types of testing

    units of computation
    classes, functions, dependencies

  unit testing verifies each one of these units is behaving properly in isolation
  integration testing verifies compositions of units are behaving properly together
  acceptance testing verifies the software from the user's point of view

  bugs can arise between units

  a good testing strategy takes all test into account

  unit test are very quick and usually within the inner cycle of development
  integration test are a bit slower and helps ensure units are working well together
  acceptance test are the ultimate customer satisfaction tests these tests need to utilize units and integrations first before getting an accurate reading

    there's a framework for all types of testing


    testing terminology

    @Test - what needs to be tested
    @BeforeEach - what needs to be determined before each test
    @AfterEach - what needs to be determined after each test

    Assert - checks the values to do a test and return if it passes or fails
    some frameworks run test synchronous (one at a time)
    others run test asynchronous(all together)

    Dependency injection
    this is a technique whereby one object supplies the dependencies of another object

    a dependency is an object that can be used
    an injection is the passing od a dependency to a dependent object that would use it

    there's 2 main ways of injections

    constructor(or method) injection

    property/setter injection

    dependency injection is not only of OOP

    trade-offs

    self-contained code easier to understand but harder to test
    dependency injected is harder to code but easier to test

    test doubles is a term for any object you use during test to replace a real object with a test‑specific object

    two primary test doubles are
    Stubs and mocks

    Stub - is a test double that provides canned answers when certain methods or properties are called during the test
    Mock - similar to stubs but have pre-programmed expectations which form a specification

    Brittle code
    if we change the code we don't want the test code to change
    or vise versa
    changing the test and the product code can leave either one of them as brittle

    best practices for testing code

    should be treated like production code
    make sure its readable need to be addressed as both positive and negative test cases
    and beware of duplicating code, separate common setup and tear down logic

    always review test when working in a team to maintain a consistent testing method
    catch bad habits
    and find common challenges and come up with a solutions

    Anit-patterns
    dependency's between test

    test order shouldnt matter
    cascading failures
    execution making sure test should work regardless of serial

    focus on the what not the how
    testing the how leads to brittle code when refactored

    keep an eye on long running tests
    it could be a sign that code might be too coupled and warning signs that code isnt testable

    limitations

    can have some holes in your tests
    tdd is not sufficient by itself

    deployment verification
    network changes
    integration testing

    agile is not a requirement for tdd

    latency - the amount of time it takes from an input and how long it takes to run

    performance is important










     */
}
