package hello;

import org.springframework.data.repository.CrudRepository;

public interface ChuckNorrisFactsRepository extends CrudRepository<ChuckNorrisFact, Long> {

}



//package hello;
//
//import org.springframework.stereotype.Component;
//
//import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class ChuckNorrisFactsRepository {
//
//    private final List<ChuckNorrisFact> facts = new ArrayList<>();
//
//    public ChuckNorrisFactsRepository() {
//        facts.add(createFact(1L, "Chuck Norris does not sleep, he waits"));
//        facts.add(createFact(2L, "Chuck Norris does not dial the wrong number, You answer the wrong phone."));
//    }
//
//    private ChuckNorrisFact createFact(final Long id, final String fact) {
//        final ChuckNorrisFact chuckNorrisFact = new ChuckNorrisFact();
//        chuckNorrisFact.setId(id);
//        chuckNorrisFact.setFact(fact);
//        return chuckNorrisFact;
//    }
//
//    public Iterable<ChuckNorrisFact> findAll() {
//        return Collections .unmodifiableList(facts);
//    }
//
//    public Optional<ChuckNorrisFact> findById(final Long id) {
//        for (final ChuckNorrisFact fact : facts) {
//            if (id.equals(fact.getId())) {
//                return Optional.of(fact);
//            }
//        }
//        return Optional.empty();
//    }
//}
