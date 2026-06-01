package network_notes_demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nodes")
public class NodeController {

    private final NodeRepository repository = new NodeRepository();

    @GetMapping
    public List<Node> getAllNodes() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Node getNodeById(@PathVariable Long id) {
        return repository.findById(id);
    }
}