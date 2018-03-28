package at.refugeescode.mp5themarathon.endpoint;

import at.refugeescode.mp5themarathon.model.Runner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@RestController
public class RunnersEndpoint {

    private List<Runner> runners = new ArrayList<>();

    @GetMapping("/runners")
    List<Runner> showAllRunners() {
        return runners;
    }

    @PostMapping("/runners")
    Runner addRunner(@RequestBody Runner runner) {
        runners.add(runner);
        return runner;
    }

    @GetMapping("/winner")
    Runner showWinner() {
        return getWinner();
    }

    private Runner getWinner() {
        Optional<Runner> winner = runners.stream()
                .min(Comparator.comparing(Runner::getTime));

        if (winner.isPresent()) {
            return winner.get();
        } else {
            return new Runner("Nobody");
        }
    }

}
