/*
package com.p0006.service.impl;

import com.ebisys.waterwatch.model.WaterConsumption;
import com.ebisys.waterwatch.repository.WaterConsumptionRepository;
import com.ebisys.waterwatch.service.WaterConsumptionService;
import com.p0006.entity.BikeRental;
import com.p0006.repository.BikeRentalRepository;
import com.p0006.service.BikeRentalService;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.locationtech.jts.geom.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class BikeRentalServiceImpl implements BikeRentalService {

	@Autowired
	private BikeRentalRepository bikeRentalRepository;

	public List<BikeRental> findAll() {
		save_csv();
		return bikeRentalRepository.findAll();
	}

	*/
/*public List<WaterConsumption> findTopTenConsumers() {
		return waterConsumptionRepository.findTopTenConsumers();
	}*//*


	public void save_csv() {

		// Read all the data from our table and store it in the response object
		List<BikeRental> res = bikeRentalRepository.findAll();

		if (res.isEmpty()) {
			System.out.println("No Data");

			String[] HEADERS = {"Suburb", "AverageMonthlyKL", "Latitude", "Longitude"};
			String fileLocation = "C:\\Users\\Administrator\\Documents\\workspace-spring-tool-suite-4-4.11.1.RELEASE\\waterwatch\\src\\main\\resources\\waterwatch_data.csv";

			try {
				Reader in = new FileReader(fileLocation);
				Iterable<CSVRecord> records = CSVFormat.DEFAULT
						.withHeader(HEADERS)
						.withFirstRecordAsHeader()
						.parse(in);

				for (CSVRecord csvRecord : records) {
					String suburb = csvRecord.get("Suburb");
					String averageMonthlyKL = csvRecord.get("AverageMonthlyKL");
					String latitude = csvRecord.get("Latitude");
					String longitude = csvRecord.get("Longitude");

					// Convert to proper data types
					Integer avgMonthlyKL = Integer.valueOf(averageMonthlyKL);
					double dLatitude = Double.parseDouble(latitude);
					double dLongitude = Double.parseDouble(longitude);
					Point geom = new GeometryFactory().createPoint(new Coordinate(dLongitude, dLatitude));

					// Load data into our WaterConsumption Table
					BikeRental b = new BikeRental();
					*/
/*
					*
					* *//*

					bikeRentalRepository.save(b);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Data Loaded");
		}
	}






































}
*/
