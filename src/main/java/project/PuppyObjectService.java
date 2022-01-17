package project;

public class PuppyObjectService {
    private PuppyObjectRepository puppyObjectRepository;

    public PuppyObjectService(PuppyObjectRepository puppyObjectRepository) {
        this.puppyObjectRepository = puppyObjectRepository;
    }

    public Puppy getPuppy() {
        return puppyObjectRepository.getPuppy();
    }
}
