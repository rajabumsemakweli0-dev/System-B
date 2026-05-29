
import com.example.demo.entity.MenuItem;
import com.example.demo.Repository.MenuItemRepository;
import com.example.demo.Service.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository menuItemRepository;

    @Override
    public MenuItem createMenuItem(MenuItem menuItem) {

        menuItem.setIsAvailable(true);

        return menuItemRepository.save(menuItem);
    }

    @Override
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    @Override
    public List<MenuItem> getByRestaurant(Long restaurantId) {
        return menuItemRepository.findByRestaurantId(restaurantId);
    }

    @Override
    public List<MenuItem> getAvailableItems() {
        return menuItemRepository.findByIsAvailableTrue();
    }
}
