const stripe = Stripe('pk_test_51TkwfGGhoieoalJO84PxkeYMrGgmjp1DkcQN2uX2eJtUSIbOUAg9QBkX7tNrckofDpQlG1dO2HsAthPhQ9MOHUsZ00NDetMNud');

const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {

    stripe.redirectToCheckout({

        sessionId: sessionId

    })

});