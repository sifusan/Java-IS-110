


public Animal findAnimal(String animalName) {

    for (Animal a: animals) {
        if(a.getName() == aninmalName) {
            return a;
        }
    }
    return null;
}
        
public void removeAnimal(String animalName) {
    Iterator<Animal> it = animals.iterator();
    Animal animal;
    
    while(it.hasNext()) {
        animal = it.next();
        if (animal.getName() == animalName) {
            it.remove();
        }
    }
}


public void removeAnimal(String animalName) {
    Iterator<Animal> it = animals.iterator();
    while(it.hasNext()) {
        Amimal a = it.next();
        if (a.getName() == animalName) {
            a.remove();
        }
    }
}
        
