package org.swcraft.testing.bank

import spock.lang.*

class AccountSpec extends Specification {

    def "The balance of new account should be empty!"() {
        given:
        def account = new Account()

        expect:
        account.balance == 0.0
    }

    def "Add money the an empty account"() {
        given:
        def account = new Account()

        when:
        account.add(4.0)
        account.add(2.0)

        then:
        account.balance == 6.0
    }

    def "Add money then withdraw from it"() {
        given:
        def account = new Account()
        account.add(3.0)

        when:
        account.withdraw(2.0)

        then:
        account.balance == 1.0
    }
}
