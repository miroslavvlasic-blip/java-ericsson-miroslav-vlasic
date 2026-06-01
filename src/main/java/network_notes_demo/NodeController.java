package network_notes_demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nodes")
public class NodeController {

    private final NodeService service;

    public NodeController(NodeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Node> getAllNodes() {
        return service.getAllNodes();
    }

    @GetMapping("/{id}")
    public Node getNodeById(@PathVariable Long id) {
        return service.getNodeById(id);
    }

    @PostMapping
    public Node addNode(@RequestBody Node node) {
        return service.addNode(node);
    }

    @GetMapping("/vendor/{vendor}")
    public List<Node> getNodesByVendor(@PathVariable String vendor) {
        return service.getNodesByVendor(vendor);
    }
}