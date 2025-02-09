

export function isValid(cartItems) {
  // Check if cartItems is empty
  if (!cartItems || cartItems.length === 0) {
    return false;
  }

  const restaurantId = cartItems[0]?.food?.restaurant?.id;
  
  // If there's no restaurantId, return false
  if (!restaurantId) {
    return false;
  }

  for (let item of cartItems) {
    // If the item is missing food or restaurant, return false
    if (!item.food?.restaurant?.id || item.food.restaurant.id !== restaurantId) {
      return false;
    }
  }

  return true;
}
