
Feature           	Two-Pointer (sortColors)	Counting Sort (sortColorsCounting)
Algorithm Type       In-place, Single-pass     	Counting Sort
Time Complexity              	O(n)	                O(n)
Space Complexity            	O(1)                	O(1)
Number of Passes	             1	                    2
In-place Modification        	Yes                   	Yes
Complexity                 	Moderate	              Simple

1. Inventory Management
In warehouses and retail stores, inventory items are often categorized by priority or type:

High Priority Items (e.g., perishable goods): These need to be processed or sold first.
Medium Priority Items (e.g., regular stock): These are processed as usual.
Low Priority Items (e.g., non-perishable goods): These can be processed later.
The sorting algorithm can help in organizing items so that high-priority items are placed at the front for quick access and processing, while lower-priority items are moved to the back.

2. Image Segmentation
In computer vision and image processing, different colors or segments within an image need to be identified and grouped:

Background (color 0)
Foreground objects (color 1)
Other specific features (color 2)
The algorithm can be used to sort and categorize different segments of an image based on pixel values, facilitating further processing like object detection or background subtraction.

3. Scheduling and Task Management
In project management or task scheduling:

High Urgency Tasks (color 0): Need to be addressed immediately.
Medium Urgency Tasks (color 1): Need to be addressed soon.
Low Urgency Tasks (color 2): Can be addressed later.
The algorithm helps in sorting tasks such that high-urgency tasks are at the top of the list, ensuring they are completed first.

4. Data Classification
In data science and machine learning, datasets often need to be classified and sorted:

Category A (color 0)
Category B (color 1)
Category C (color 2)
The algorithm can be used to preprocess data by sorting it into these categories, which can then be used for training or analysis.

5. Network Packet Prioritization
In networking, data packets can be prioritized based on their type:

Critical Packets (color 0): Require immediate transmission.
Normal Packets (color 1): Standard transmission.
Low Priority Packets (color 2): Can be delayed if needed.
The sorting algorithm helps in arranging packets such that critical packets are transmitted first, ensuring the quality of service (QoS) in networks.

Example Code Adaptation for Real-Life Use (Inventory Management)

  
public class InventorySorter {

    public void sortInventoryItems(Item[] items) {
        int low = 0, mid = 0, high = items.length - 1;
        while (mid <= high) {
            if (items[mid].priority == Priority.HIGH) {
                swap(items, low++, mid++);
            } else if (items[mid].priority == Priority.MEDIUM) {
                mid++;
            } else {
                swap(items, mid, high--);
            }
        }
    }

    private void swap(Item[] items, int i, int j) {
        Item temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item("Milk", Priority.HIGH),
            new Item("Canned Beans", Priority.LOW),
            new Item("Bread", Priority.HIGH),
            new Item("Soap", Priority.MEDIUM),
            new Item("Rice", Priority.LOW)
        };
        InventorySorter sorter = new InventorySorter();
        sorter.sortInventoryItems(items);
        for (Item item : items) {
            System.out.println(item.name + " - " + item.priority);
        }
    }
}

enum Priority {
    HIGH, MEDIUM, LOW
}

class Item {
    String name;
    Priority priority;

    Item(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }
}
