

import com.example.demo.entity.MenuItem;
import com.example.demo.Service.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu-items")
@RequiredArgsConstructor
public class MenuItemController {

    private final MenuItemService menuItemService;

    // CREATE MENU ITEM
    @PostMapping
    public MenuItem create(@RequestBody MenuItem menuItem) {
        return menuItemService.createMenuItem(menuItem);
    }

    // GET ALL
    @GetMapping
    public List<MenuItem> getAll() {
        return menuItemService.getAllMenuItems();
    }

    // GET BY RESTAURANT
    @GetMapping("/restaurant/{restaurantId}")
    public List<MenuItem> getByRestaurant(@PathVariable Long restaurantId) {
        return menuItemService.getByRestaurant(restaurantId);
    }

    // GET AVAILABLE ITEMS
    @GetMapping("/available")
    public List<MenuItem> getAvailable() {
        return menuItemService.getAvailableItems();
    }
}

