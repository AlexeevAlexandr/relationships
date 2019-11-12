package com.ManyToOne;

import com.Main;
import com.ManyToOne_OneToMany.entity.Address;
import com.ManyToOne_OneToMany.entity.Human;
import com.ManyToOne_OneToMany.service.AddressService;
import com.ManyToOne_OneToMany.service.HumanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main.class)
public class Tests {

    @Autowired
    private HumanService humanService;
    @Autowired
    private AddressService addressService;

    @Test //create two humans with the same addresses
    public void createHumanTest() {
        Address address = new Address("First str.", 1);
        Address addressSaved = addressService.create(address);
        Human human = new Human("Peter", addressSaved);
        Human human2 = new Human("Donald", addressSaved);

        System.out.println(humanService.create(human));
        System.out.println(humanService.create(human2));
    }

    @Test //delete a human
    public void deleteHumanTest() {
        Address address = new Address("Second str.", 1);
        Address addressSaved = addressService.create(address);
        Human human = new Human("Nolan", addressSaved);
        humanService.create(human);
        System.out.println(humanService.getAll());

        humanService.delete(human.getId());

        System.out.println(humanService.getAll());
    }

    @Test(expected = Exception.class) //can't delete an address if there is a person with that address
    public void deleteAddressTest() {
        Address address = new Address("First str.", 1);
        Address addressSaved = addressService.create(address);
        Human human = new Human("Peter", addressSaved);
        humanService.create(human);
        addressService.delete(addressSaved.getId());
    }
}
