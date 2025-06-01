INSERT INTO rental_property (
    id, description, town, address, property_type_id, rent_amount,
    security_deposit_amount, area, number_of_bedrooms, floor_number,
    number_of_floors, construction_year, energy_classification_id,
    has_elevator, has_intercom, has_balcony, has_parking_space
) VALUES (
             '20000000-0000-0000-0000-000000000001',
             'Appartement bien situé près du métro et des commerces',
             'Neuilly-sur-Seine',
             '90 rue de la Victoire',
             '10000000-0000-0000-0000-000000000001',
             1040.9, 1250.9, 50.69, 3, 2, 5, 1989,
             '00000000-0000-0000-0000-000000000002',
             true, true, true, true
         );